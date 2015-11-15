package com.poorjar.library;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poorjar.library.dataaccess.Rental;
import com.poorjar.library.dataaccess.RentalRepository;

@RestController
@EnableAutoConfiguration
public class RentalsController {
    private static Logger LOGGER = Logger.getLogger(RentalsController.class);
    @Autowired
    private RentalRepository rentalRepository;

    /**
     * Creates rentals with the provided info.
     * 
     * @param rentals The rentals to be created.
     * @return Collection of newly created rentals.
     */
    @RequestMapping(value = "/library/rentals/create", method = RequestMethod.POST)
    public Collection<Rental> create(@RequestBody Collection<Rental> rentals) {
        LOGGER.error(rentals);
        return this.rentalRepository.insert(rentals);
    }

    /**
     * Updates given rentals.
     * 
     * @param rentals rentals to be updated.
     * @return Updated rentals.
     */
    @RequestMapping(value = "/library/rentals/update", method = RequestMethod.PUT)
    public List<Rental> update(@RequestBody Collection<Rental> rentals) {
        LOGGER.debug(rentals);
        return this.rentalRepository.save(rentals);
    }

    /**
     * Gets all rentals in the library.
     * 
     * @return List of rentals.
     */
    @RequestMapping(value = "/library/rentals/all", method = RequestMethod.GET)
    public List<Rental> getAllRentals() {
        List<Rental> rentals = this.rentalRepository.findAll();
        for (Rental rental : rentals) {
            LOGGER.debug(rental.toString());
        }
        return rentals;
    }

    /**
     * Deletes a rental with the given unique identifier.
     * 
     * @param id The id of the rental.
     */
    @RequestMapping(value = "/library/rentals/delete/{id}", method = RequestMethod.DELETE)
    public void deleteRental(@PathVariable String id) {
        this.rentalRepository.delete(id);
    }

    /**
     * Deletes a collection of rentals.
     * 
     * @param rentals Rentals to be deleted.
     */
    @RequestMapping(value = "/library/rentals/delete", method = RequestMethod.DELETE)
    public void deleteRentals(@RequestBody Collection<Rental> rentals) {
        this.rentalRepository.delete(rentals);
    }
}