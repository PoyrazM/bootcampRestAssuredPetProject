package Builder;

import datas.PetPath;
import io.restassured.response.Response;
import model.Pet;

public class PetApi {

    public static Response getAvailable(){
        return ResponseCreator.getAvailable(PetPath.PET_AVAILABLE);
    }

    public static Response getPending(){
        return ResponseCreator.getPending(PetPath.PET_PENDING);
    }

    public static Response getSold(){
        return ResponseCreator.getSold(PetPath.PET_SOLD);
    }

    public static Response post(Pet requestPet){
        return ResponseCreator.post(PetPath.PET , requestPet);
    }

    public static Response get(int id) {
        return ResponseCreator.get(PetPath.PET +PetPath.GET_ID + id);
    }

    public static Response delete(int id){
        return ResponseCreator.delete(PetPath.PET + PetPath.GET_ID + id);
    }
}
