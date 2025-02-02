import React from 'react';
import { StyleSheet, View } from 'react-native';
import { ThemedText } from './ThemedText';

export const Footer = () => {
  return (
    <View style={styles.footer}>
      <ThemedText>© 2025 CPB Explorer</ThemedText>
    </View>
  );
};

const styles = StyleSheet.create({
  footer: {
    height: 60,
    padding: 10,
    justifyContent: 'center',
    alignItems: 'center',
    borderTopWidth: 1,
    borderTopColor: '#eee',
  },
});