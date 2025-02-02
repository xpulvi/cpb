import { StyleSheet, Image, View } from 'react-native';
import { Nav } from '@/components/Nav';
import { SearchBar } from '@/components/SearchBar';
import { Filters } from '@/components/Filters';
import { ActionButtons } from '@/components/ActionButtons';
import { Footer } from '@/components/Footer';
import ParallaxScrollView from '@/components/ParallaxScrollView';

export default function TabTwoScreen() {
  const handleFilterChange = (filter) => {
    // Gestisci il cambio di filtro qui
    console.log('Selected filter:', filter);
  };

  return (
    <View style={styles.container}>
      <Nav />
      <View style={styles.content}>
        <Filters onFilterChange={handleFilterChange} />
        <View style={styles.mainContent}>
          <SearchBar />
          <ParallaxScrollView
            headerBackgroundColor={{ light: '#D0D0D0', dark: '#353636' }}
            headerImage={
              <Image 
                source={require('../../components/img/logo_cpb_v02.png')} 
                style={styles.logo}
              />
            }
          >
            {/* Qui andrà il contenuto delle carte in base al filtro selezionato */}
          </ParallaxScrollView>
        </View>
      </View>
      <ActionButtons />
      <Footer />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  content: {
    flex: 1,
    flexDirection: 'row',
  },
  mainContent: {
    flex: 1,
  },
  logo: {
    width: 340,
    height: 340,
    marginLeft: -20,
    marginTop: -20,
    resizeMode: 'contain',
  },
});