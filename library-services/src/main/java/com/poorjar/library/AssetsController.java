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

import com.poorjar.library.dataaccess.Asset;
import com.poorjar.library.dataaccess.AssetRepository;

@RestController
@EnableAutoConfiguration
public class AssetsController {
    private static Logger LOGGER = Logger.getLogger(AssetsController.class);
    @Autowired
    private AssetRepository assetRepository;

    /**
     * Creates assets with the provided info.
     * 
     * @param assets The assets to be created.
     * @return Collection of newly created assets.
     */
    @RequestMapping(value = "/library/assets/create", method = RequestMethod.POST)
    public Collection<Asset> create(@RequestBody Collection<Asset> assets) {
        LOGGER.error(assets);
        return this.assetRepository.insert(assets);
    }

    /**
     * Updates a given asset.
     * 
     * @param asset Asset to be updated.
     * @return Updated asset.
     */
    @RequestMapping(value = "/library/assets/update", method = RequestMethod.PUT)
    public List<Asset> update(@RequestBody Collection<Asset> assets) {
        LOGGER.debug(assets);
        return this.assetRepository.save(assets);
    }

    /**
     * Gets a collection of assets that match the specified title.
     * 
     * @param title Title of the asset
     * @return A collection of assets that match the specified title.
     */
    @RequestMapping(value = "/library/assets/title/{title}", method = RequestMethod.GET)
    public Collection<Asset> getAsset(@PathVariable String title) {
        LOGGER.debug(title);
        Collection<Asset> assets = this.assetRepository.findByTitle(title);
        for (Asset asset : assets) {
            System.out.println(asset);
        }
        return assets;
    }

    /**
     * Gets all assets in the library.
     * 
     * @return List of assets.
     */
    @RequestMapping(value = "/library/assets/all", method = RequestMethod.GET)
    public List<Asset> getAllAssets() {
        List<Asset> assets = this.assetRepository.findAll();
        for (Asset asset : assets) {
            LOGGER.debug(asset.toString());
        }
        return assets;
    }

    /**
     * Deletes an asset with the given unique identifier.
     * 
     * @param id The id of the asset.
     */
    @RequestMapping(value = "/library/assets/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAsset(@PathVariable String id) {
        this.assetRepository.delete(id);
    }

    /**
     * Deletes a collection of assets.
     * 
     * @param assets Assets to be deleted.
     */
    @RequestMapping(value = "/library/assets/delete", method = RequestMethod.DELETE)
    public void deleteAssets(@RequestBody Collection<Asset> assets) {
        this.assetRepository.delete(assets);
    }
}