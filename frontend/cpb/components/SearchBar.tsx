import React from 'react';
import { StyleSheet, TextInput, View } from 'react-native';

export const SearchBar = () => {
  return (
    <View style={styles.searchContainer}>
      <TextInput 
        style={styles.searchInput}
        placeholder="Cerca..."
        placeholderTextColor="#666"
      />
    </View>
  );
};

const styles = StyleSheet.create({
  searchContainer: {
    padding: 10,
    backgroundColor: '#fff',
    borderRadius: 8,
    margin: 10,
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.1,
    shadowRadius: 4,
    elevation: 3,
  },
  searchInput: {
    height: 40,
    padding: 10,
  },
});