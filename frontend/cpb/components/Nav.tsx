import React from 'react';
import { StyleSheet, View } from 'react-native';
import { ThemedText } from './ThemedText';

export const Nav = () => {
  return (
    <View style={styles.nav}>
      <ThemedText type="title">CPB Explorer</ThemedText>
    </View>
  );
};

const styles = StyleSheet.create({
  nav: {
    height: 60,
    padding: 10,
    justifyContent: 'center',
    alignItems: 'center',
    borderBottomWidth: 1,
    borderBottomColor: '#eee',
  },
});