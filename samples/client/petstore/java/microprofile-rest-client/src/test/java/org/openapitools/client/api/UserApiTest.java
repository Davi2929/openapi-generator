/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * OpenAPI Petstore Test
 *
 * API tests for UserApi 
 */
public class UserApiTest {

    private UserApi client;
    private String baseUrl = "http://localhost:9080";
    
    @Before
    public void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(UserApi.class);
    }

    
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() {
    	// TODO: test validations
        User body = null;
        //void response = api.createUser(body);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Creates list of users with given input array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithArrayInputTest() {
    	// TODO: test validations
        List<User> body = null;
        //void response = api.createUsersWithArrayInput(body);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Creates list of users with given input array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() {
    	// TODO: test validations
        List<User> body = null;
        //void response = api.createUsersWithListInput(body);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() {
    	// TODO: test validations
        String username = null;
        //void response = api.deleteUser(username);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Get user by user name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByNameTest() {
    	// TODO: test validations
        String username = null;
        //User response = api.getUserByName(username);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Logs user into the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginUserTest() {
    	// TODO: test validations
        String username = null;
        String password = null;
        //String response = api.loginUser(username, password);
        //assertNotNull(response);
        
        
    }
    
    /**
     * Logs out current logged in user session
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutUserTest() {
    	// TODO: test validations
        //void response = api.logoutUser();
        //assertNotNull(response);
        
        
    }
    
    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() {
    	// TODO: test validations
        String username = null;
        User body = null;
        //void response = api.updateUser(username, body);
        //assertNotNull(response);
        
        
    }
    
}