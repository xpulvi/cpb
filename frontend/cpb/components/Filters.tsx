import React, { useState } from 'react';
import { StyleSheet, View, TouchableOpacity } from 'react-native';
import { ThemedText } from './ThemedText';

const filterOptions = ['Character', 'Book', 'Collection', 'City'];

export const Filters = ({ onFilterChange }) => {
  const [selectedFilter, setSelectedFilter] = useState('Character');

  const handleFilterSelect = (filter) => {
    setSelectedFilter(filter);
    onFilterChange(filter);
  };

  return (
    <View style={styles.filtersContainer}>
      {filterOptions.map((filter) => (
        <TouchableOpacity
          key={filter}
          style={[
            styles.filterButton,
            selectedFilter === filter && styles.filterButtonActive,
          ]}
          onPress={() => handleFilterSelect(filter)}
        >
          <ThemedText style={selectedFilter === filter && styles.filterTextActive}>
            {filter}
          </ThemedText>
        </TouchableOpacity>
      ))}
      <TouchableOpacity 
        style={styles.graphButton}
        onPress={() => {/* Navigazione alla vista grafo */}}
      >
        <ThemedText>Grafo</ThemedText>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  filtersContainer: {
    width: '25%',
    padding: 10,
    borderRightWidth: 1,
    borderRightColor: '#eee',
  },
  filterButton: {
    padding: 10,
    marginBottom: 5,
    borderRadius: 5,
  },
  filterButtonActive: {
    backgroundColor: '#e0e0e0',
  },
  filterTextActive: {
    fontWeight: 'bold',
  },
  graphButton: {
    marginTop: 20,
    padding: 10,
    backgroundColor: '#f0f0f0',
    borderRadius: 5,
    alignItems: 'center',
  },
});