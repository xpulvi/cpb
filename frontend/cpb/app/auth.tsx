import { View, Text, TextInput, Pressable, Alert } from "react-native";
import { router, useLocalSearchParams } from "expo-router";
import { useState, useEffect } from "react";
import { styles } from './styles/common';
import { authService } from './services/auth';
import { useAuth } from './context/auth';

export default function Auth() {
  const { mode } = useLocalSearchParams();
  const [isLogin, setIsLogin] = useState(true);
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [isLoading, setIsLoading] = useState(false);
  const { login } = useAuth();

  useEffect(() => {
    setIsLogin(mode === 'login');
  }, [mode]);

  const handleSubmit = async () => {
    if (!email || !password) {
      Alert.alert('Errore', 'Per favore inserisci email e password');
      return;
    }

    setIsLoading(true);
    try {
      if (isLogin) {
        const response = await authService.login({ email, password });
        await login(response.jwt, response.user);
        router.replace('/(tabs)/explore');
      } else {
        await authService.signup({ email, password });
        Alert.alert(
          'Registrazione completata',
          'Per favore controlla la tua email per attivare l\'account.',
          [{ text: 'OK', onPress: () => setIsLogin(true) }]
        );
      }
    } catch (error) {
      Alert.alert(
        'Errore',
        isLogin ? 'Email o password non validi' : 'Errore durante la registrazione'
      );
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>{isLogin ? "Login" : "Registrazione"}</Text>
      <TextInput
        style={styles.input}
        placeholder="Email"
        value={email}
        onChangeText={setEmail}
        autoCapitalize="none"
        keyboardType="email-address"
        editable={!isLoading}
      />
      <TextInput
        style={styles.input}
        placeholder="Password"
        value={password}
        onChangeText={setPassword}
        secureTextEntry
        editable={!isLoading}
      />
      <Pressable 
        style={[styles.button, isLoading && styles.buttonDisabled]}
        onPress={handleSubmit}
        disabled={isLoading}
      >
        <Text style={styles.buttonText}>
          {isLoading ? "Caricamento..." : (isLogin ? "Login" : "Registrati")}
        </Text>
      </Pressable>
      <Pressable
        style={styles.linkButton}
        onPress={() => setIsLogin(!isLogin)}
        disabled={isLoading}
      >
        <Text style={styles.linkText}>
          {isLogin ? "Passa alla registrazione" : "Passa al login"}
        </Text>
      </Pressable>
    </View>
  );
}