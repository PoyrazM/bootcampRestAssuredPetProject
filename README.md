# Swagger Pet API Project

- GET/pet/findByStatus endpointi için available , pending ve sold parametrelerinde testler yazılmıştır.
![image](https://user-images.githubusercontent.com/105527159/185829317-84914c61-1109-4873-8bd0-0534837ff7ab.png)
- POST/pet endpointi için availeble , pending ve sold statusleri için farklı farklı JSON formatında data ekleme işlemleri yapılmıştır.
![image](https://user-images.githubusercontent.com/105527159/185829410-c4e7d6ab-8d83-4b4a-bbc1-fb705de73d91.png)
- GET/pet/{petId} endpointi için available , pending ve sold statusleri için POST Requesti sonrası oluşturulan ID'ye göre GET Requestleri atılmıştır.
![image](https://user-images.githubusercontent.com/105527159/185829544-6b588b6a-dda6-4238-9b0d-4021ff564501.png)
- DELETE/pet/{petId} endpointi için available , pending ve sold statusleri için POST Requesti sonrası oluşturulan dataların ID'sinden DELETE Requesti atılıp datalar silinmiştir.
![image](https://user-images.githubusercontent.com/105527159/185830083-e26c0e3b-e09c-4d35-8d1a-6d97c8d2f9f1.png)

### TestNG Kullanılarak Yazılan Test Classları

- [Available](https://github.com/PoyrazM/bootcampRestAssuredPetProject/blob/main/bootcampFinalProjectPetApi/src/test/java/tests/PetApiAvailableTestNG.java)
- [Pending](https://github.com/PoyrazM/bootcampRestAssuredPetProject/blob/main/bootcampFinalProjectPetApi/src/test/java/tests/PetPendingTestNG.java)
- [Sold](https://github.com/PoyrazM/bootcampRestAssuredPetProject/blob/main/bootcampFinalProjectPetApi/src/test/java/tests/PetSoldTestNG.java)

## Allure Results
![petAllure1](https://user-images.githubusercontent.com/105527159/185831380-d6857901-5ba1-4389-935b-e68314168be6.PNG)
![petAllure2](https://user-images.githubusercontent.com/105527159/185831419-05d6a328-959a-42e6-b559-4ed05e009949.PNG)

## Tech
- Rest Assured
- Lombok
- TestNG
- Allure
- Java Faker

- [Swagger](https://petstore.swagger.io/#/)


## Author - [PoyrazM](https://github.com/PoyrazM)
