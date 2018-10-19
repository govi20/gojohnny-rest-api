package co.gojohnny.service;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.auth.Credentials;
import com.google.photos.library.v1.PhotosLibraryClient;
import com.google.photos.library.v1.PhotosLibrarySettings;
import com.google.photos.library.v1.proto.Album;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PhotoLibraryClient {

    public static void main(String[] args) throws IOException {
        // Set up the Photos Library Client that interacts with the API

        //it'll be deleted
        Credentials temp = null;
        PhotosLibrarySettings settings =
                PhotosLibrarySettings.newBuilder()
                        .setCredentialsProvider(
                                FixedCredentialsProvider.create(temp))
                        .build();

        try (PhotosLibraryClient photosLibraryClient =
                     PhotosLibraryClient.initialize(settings)) {

            // Create a new Album  with at title
            Album createdAlbum = photosLibraryClient.createAlbum("gojohnny_photobase");

            // Get some properties from the album, such as its ID and product URL
            String id = createdAlbum.getId();
            String url = createdAlbum.getProductUrl();

        } catch (ApiException e) {
            // Error during album creation
        }
    }
}
