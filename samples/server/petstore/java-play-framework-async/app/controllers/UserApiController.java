package controllers;

import java.time.OffsetDateTime;
import apimodels.User;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class UserApiController extends Controller {
    private final UserApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UserApiController(Config configuration, UserApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public CompletionStage<Result> createUser(Http.Request request) throws Exception {
        JsonNode nodebody = request.body().asJson();
        User body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), User.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        return imp.createUserHttp(request, body);
    }

    @ApiAction
    public CompletionStage<Result> createUsersWithArrayInput(Http.Request request) throws Exception {
        JsonNode nodebody = request.body().asJson();
        List<@Valid User> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<List<@Valid User>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (User curItem : body) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        return imp.createUsersWithArrayInputHttp(request, body);
    }

    @ApiAction
    public CompletionStage<Result> createUsersWithListInput(Http.Request request) throws Exception {
        JsonNode nodebody = request.body().asJson();
        List<@Valid User> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<List<@Valid User>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (User curItem : body) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        return imp.createUsersWithListInputHttp(request, body);
    }

    @ApiAction
    public CompletionStage<Result> deleteUser(Http.Request request, String username) throws Exception {
        return imp.deleteUserHttp(request, username);
    }

    @ApiAction
    public CompletionStage<Result> getUserByName(Http.Request request, String username) throws Exception {
        return imp.getUserByNameHttp(request, username);
    }

    @ApiAction
    public CompletionStage<Result> loginUser(Http.Request request) throws Exception {
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        return imp.loginUserHttp(request, username, password);
    }

    @ApiAction
    public CompletionStage<Result> logoutUser(Http.Request request) throws Exception {
        return imp.logoutUserHttp(request);
    }

    @ApiAction
    public CompletionStage<Result> updateUser(Http.Request request, String username) throws Exception {
        JsonNode nodebody = request.body().asJson();
        User body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), User.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        return imp.updateUserHttp(request, username, body);
    }

}
