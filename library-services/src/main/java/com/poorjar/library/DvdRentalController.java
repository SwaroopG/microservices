package com.poorjar.library;

import com.poorjar.library.dataaccess.Dvd;
import com.poorjar.library.dataaccess.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by Swaroop on 11/22/15.
 */
@RestController
public class DvdRentalController {

    @Autowired
    DvdRepository dvdRepository;

    @RequestMapping("/dvds/all")
    public List<Dvd> getDvds(){
        return dvdRepository.findAll();
    }

    @RequestMapping (value ="/dvd/create", method = RequestMethod.POST)
    public List<Dvd> createDvds(@RequestBody Collection<Dvd> dvds) {
        return dvdRepository.insert(dvds);
    }
}
