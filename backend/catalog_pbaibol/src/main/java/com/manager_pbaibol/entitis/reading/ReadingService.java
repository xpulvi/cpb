package com.manager_pbaibol.entitis.reading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadingService {

    @Autowired private IReadingRepository iReadingRepository;
    public Reading creteReading(Reading reading){
        Reading readingSave = iReadingRepository.save(reading);
        return reading;
    }

    public Reading patchReading(Long id, Reading reading){
        Reading existingReading = iReadingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reading not found with id: " + id));

        if (reading.getId() != null){
            existingReading.setId(reading.getId());
        }

        if (reading.getCosaOLetto() != null){
            existingReading.setCosaOLetto(reading.getCosaOLetto());
        }

       /* if (reading.getToday() != null){
            existingReading.setToday(reading.getToday());
        } */

        if (reading.getCosaLeggere() != null){
            existingReading.setCosaLeggere(reading.getCosaLeggere());
        }

        if (reading.getCosaMiColpitoLet() != null){
            existingReading.setCosaMiColpitoLet(reading.getCosaMiColpitoLet());
        }

        if (reading.getCheDomandeHo() != null){
            existingReading.setCheDomandeHo(reading.getCheDomandeHo());
        }

        if (reading.getRispoteTrovata() != null){
            existingReading.setRispoteTrovata(reading.getRispoteTrovata());
        }

        return iReadingRepository.save(existingReading);

    }

    public Reading putRelatives(Long id, Reading reading){
        reading.setId(id);
        Reading newReading = iReadingRepository.save(reading);
        return  newReading;
    }

    public List<Reading> readingList(){
        List<Reading> readingList = iReadingRepository.findAll();
        return readingList;
    }
    //TODO agiungere piu modi di ricerca.
    public Reading getSingleReading(Long id){
        if (iReadingRepository.existsById(id)){
            Reading singleReading = iReadingRepository.getReferenceById(id);
            return singleReading;
        }else {
            System.out.println("non esiste");
        }
        return null;
    }


}
