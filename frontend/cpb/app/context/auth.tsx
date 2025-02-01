import { createContext, useContext, useState, useEffect } from 'react';
import AsyncStorage from '@react-native-async-storage/async-storage';

interface User {
  id: number;
  email: string;
  // altri campi utente se necessario
}

interface AuthContextType {
  user: User | null;
  jwt: string | null;
  login: (token: string, userData: User) => Promise<void>;
  logout: () => Promise<void>;
  isLoading: boolean;
}

const AuthContext = createContext<AuthContextType | null>(null);

export function AuthProvider({ children }: { children: React.ReactNode }) {
  const [user, setUser] = useState<User | null>(null);
  const [jwt, setJwt] = useState<string | null>(null);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    loadStoredAuth();
  }, []);

  async function loadStoredAuth() {
    try {
      const [storedToken, storedUser] = await Promise.all([
        AsyncStorage.getItem('jwt'),
        AsyncStorage.getItem('user'),
      ]);

      if (storedToken && storedUser) {
        setJwt(storedToken);
        setUser(JSON.parse(storedUser));
      }
    } catch (error) {
      console.error('Error loading auth data:', error);
    } finally {
      setIsLoading(false);
    }
  }

  async function login(token: string, userData: User) {
    try {
      await Promise.all([
        AsyncStorage.setItem('jwt', token),
        AsyncStorage.setItem('user', JSON.stringify(userData)),
      ]);
      setJwt(token);
      setUser(userData);
    } catch (error) {
      console.error('Error saving auth data:', error);
      throw error;
    }
  }

  async function logout() {
    try {
      await Promise.all([
        AsyncStorage.removeItem('jwt'),
        AsyncStorage.removeItem('user'),
      ]);
      setJwt(null);
      setUser(null);
    } catch (error) {
      console.error('Error removing auth data:', error);
      throw error;
    }
  }

  return (
    <AuthContext.Provider value={{ user, jwt, login, logout, isLoading }}>
      {children}
    </AuthContext.Provider>
  );
}

export function useAuth() {
  const context = useContext(AuthContext);
  if (!context) {
    throw new Error('useAuth must be used within an AuthProvider');
  }
  return context;
}