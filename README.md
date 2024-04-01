


<h1 id="openapi-definition">Welcome To "GestionAudioVisal v0</h1>
The purpose of this project has been to create an Audio Visual manager

## Technologies Used 
1. JWT
2. JAVA
3. Hibernate
4. SpringWeb
5. Spring Boot
6. Spring Security
7. Spring Data JPA
8. Swagger OpenApi

## How to use 
First clone this repository 

Implements this Database

```
--  Tablas 
DROP DATABASE IF EXISTS gestionAudiovisual;

CREATE DATABASE IF NOT EXISTS gestionAudiovisual;

USE gestionAudiovisual; 

CREATE TABLE usuario (
  idUsuario int PRIMARY KEY AUTO_INCREMENT,
  nombre varchar(100),
  correoElectronico varchar(255),
  contraseña varchar(155)
);

CREATE TABLE contenido (
  idContenido int PRIMARY KEY AUTO_INCREMENT,
  idGenero int,
  nombre varchar(255),
  tipoContenido varchar(255),
  estadoVisualizacion varchar(50),
  plataforma varchar(50),
  calificacion int,
  comentario text
);


CREATE TABLE genero (
  idGenero int PRIMARY KEY AUTO_INCREMENT,
  nombreGenero varchar(75)
);

ALTER TABLE contenido ADD FOREIGN KEY (idGenero) REFERENCES genero (idGenero);

```
### ATTENTION 
This table is not created in the DB because is created when the application Run for the relation many to many 
```
CREATE TABLE contenidoGeneros (
--  idContenido int,
-- idUsuario int
--);
```

## Implements Inserts 

```
--Inserts 
--Usuario
INSERT INTO usuario (idUsuario, nombre, correoElectronico, contraseña) VALUES (1, 'Juan Perez', 'juanperez@example.com', 'contraseña123'); 
INSERT INTO usuario (idUsuario, nombre, correoElectronico, contraseña) VALUES (2, 'María López', 'marialopez@example.com', 'clave456'); 
INSERT INTO usuario (idUsuario, nombre, correoElectronico, contraseña) VALUES (3, 'Pedro Ramirez', 'pedroramirez@example.com', 'password789'); 

--Genero 
INSERT INTO genero (idGenero, nombreGenero) VALUES (1, 'Acción'); 
INSERT INTO genero (idGenero, nombreGenero) VALUES (2, 'Drama'); 
INSERT INTO genero (idGenero, nombreGenero) VALUES (3, 'Documental'); 

--Contenido

INSERT INTO contenido (idContenido, idGenero, nombre, tipoContenido, estadoVisualizacion, plataforma, calificacion, comentario) VALUES (1, 1, 'Película A', 'Película', 'Visto', 'Netflix', 4, 'Buena película'); 
INSERT INTO contenido (idContenido, idGenero, nombre, tipoContenido, estadoVisualizacion, plataforma, calificacion, comentario) VALUES (2, 2, 'Serie B', 'Serie', 'No visto', 'HBO', 5, 'Muy recomendada'); 
INSERT INTO contenido (idContenido, idGenero, nombre, tipoContenido, estadoVisualizacion, plataforma, calificacion, comentario) VALUES (3, 1, 'Documental C', 'Documental', 'Visto', 'Amazon Prime', 3, 'Interesante pero corto'); 

```
### ATTENTION 
this index just introducint last the project has run for first time, is for correct the missing index into application 
```
CREATE INDEX idx_id_usuario ON usuario (id_usuario);
CREATE INDEX idx_id_contenido ON contenido (id_contenido);
CREATE INDEX idx_id_genero ON genero (id_genero);
```

### SWAGGER 

If you wanned it look swagger and implements every just enter in this link 

http://localhost:8080/doc/swagger-ui/index.html#/

Base URLs:

* <a href="http://localhost:8080">http://localhost:8080</a>

# Authentication

- HTTP Authentication, scheme: bearer JWT auth description

<h1 id="openapi-definition-user-resources">User resources</h1>

## getUserById

<a id="opIdgetUserById"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`GET /users/{id}`

*Get user by ID*

<h3 id="getuserbyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getuserbyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[User](#schemauser)|

<aside class="success">
This operation does not require authentication
</aside>

## updateUser

<a id="opIdupdateUser"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`PUT /users/{id}`

*Update user*

> Body parameter

```json
{
  "idUser": 0,
  "name": "string",
  "email": "string",
  "password": "string",
  "token": "string",
  "contents": [
    {
      "idContent": 0,
      "gender": {
        "idGender": 0,
        "nameGender": "string",
        "content": [
          {}
        ]
      },
      "users": [
        {
          "idUser": 0,
          "name": "string",
          "email": "string",
          "password": "string",
          "token": "string",
          "contents": []
        }
      ],
      "nameContent": "string",
      "contentType": "string",
      "displayStatus": "string",
      "plataform": "string",
      "calification": 0,
      "comment": "string"
    }
  ]
}
```

<h3 id="updateuser-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|
|body|body|[User](#schemauser)|true|none|

> Example responses

> 200 Response

<h3 id="updateuser-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[User](#schemauser)|

<aside class="success">
This operation does not require authentication
</aside>

## deleteUser

<a id="opIddeleteUser"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`DELETE /users/{id}`

*Delete user*

<h3 id="deleteuser-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

<h3 id="deleteuser-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|None|

<aside class="success">
This operation does not require authentication
</aside>

## login

<a id="opIdlogin"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/login?user=string&encryptedPass=string");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`POST /login`

*Register a user into application given permissions*

<h3 id="login-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|user|query|string|true|none|
|encryptedPass|query|string|true|none|

> Example responses

> 200 Response

<h3 id="login-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[User](#schemauser)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

## findAll

<a id="opIdfindAll"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/findall");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`GET /findall`

*Get all users for the application*

> Example responses

> 200 Response

<h3 id="findall-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="findall-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[User](#schemauser)]|false|none|none|
|» idUser|integer(int32)|false|none|none|
|» name|string|false|none|none|
|» email|string|false|none|none|
|» password|string|false|none|none|
|» token|string|false|none|none|
|» contents|[[Content](#schemacontent)]|false|none|none|
|»» idContent|integer(int32)|false|none|none|
|»» gender|[Gender](#schemagender)|false|none|none|
|»»» idGender|integer(int32)|false|none|none|
|»»» nameGender|string|false|none|none|
|»»» content|[[Content](#schemacontent)]|false|none|none|
|»» users|[[User](#schemauser)]|false|none|none|
|»» nameContent|string|false|none|none|
|»» contentType|string|false|none|none|
|»» displayStatus|string|false|none|none|
|»» plataform|string|false|none|none|
|»» calification|integer(int32)|false|none|none|
|»» comment|string|false|none|none|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

<h1 id="openapi-definition-gender-resources">Gender resources</h1>

## findById

<a id="opIdfindById"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/Gender/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`GET /Gender/{id}`

*Get a specific gender by ID*

<h3 id="findbyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="findbyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Gender](#schemagender)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

## updateGender

<a id="opIdupdateGender"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/Gender/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`PUT /Gender/{id}`

*Update an existing gender*

> Body parameter

```json
{
  "idGender": 0,
  "nameGender": "string",
  "content": [
    {
      "idContent": 0,
      "gender": {
        "idGender": 0,
        "nameGender": "string",
        "content": []
      },
      "users": [
        {
          "idUser": 0,
          "name": "string",
          "email": "string",
          "password": "string",
          "token": "string",
          "contents": [
            {}
          ]
        }
      ],
      "nameContent": "string",
      "contentType": "string",
      "displayStatus": "string",
      "plataform": "string",
      "calification": 0,
      "comment": "string"
    }
  ]
}
```

<h3 id="updategender-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|
|body|body|[Gender](#schemagender)|true|none|

> Example responses

> 200 Response

<h3 id="updategender-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Gender](#schemagender)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

## deleteGender

<a id="opIddeleteGender"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/Gender/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`DELETE /Gender/{id}`

*Delete a gender by ID*

<h3 id="deletegender-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

<h3 id="deletegender-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|None|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

## createGender

<a id="opIdcreateGender"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/Gender/create");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`POST /Gender/create`

*Create a new gender*

> Body parameter

```json
{
  "idGender": 0,
  "nameGender": "string",
  "content": [
    {
      "idContent": 0,
      "gender": {
        "idGender": 0,
        "nameGender": "string",
        "content": []
      },
      "users": [
        {
          "idUser": 0,
          "name": "string",
          "email": "string",
          "password": "string",
          "token": "string",
          "contents": [
            {}
          ]
        }
      ],
      "nameContent": "string",
      "contentType": "string",
      "displayStatus": "string",
      "plataform": "string",
      "calification": 0,
      "comment": "string"
    }
  ]
}
```

<h3 id="creategender-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[Gender](#schemagender)|true|none|

> Example responses

> 200 Response

<h3 id="creategender-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Gender](#schemagender)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

## findAll_1

<a id="opIdfindAll_1"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/Gender/findall");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`GET /Gender/findall`

*Get all genders for the application*

> Example responses

> 200 Response

<h3 id="findall_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="findall_1-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Gender](#schemagender)]|false|none|none|
|» idGender|integer(int32)|false|none|none|
|» nameGender|string|false|none|none|
|» content|[[Content](#schemacontent)]|false|none|none|
|»» idContent|integer(int32)|false|none|none|
|»» gender|[Gender](#schemagender)|false|none|none|
|»» users|[[User](#schemauser)]|false|none|none|
|»»» idUser|integer(int32)|false|none|none|
|»»» name|string|false|none|none|
|»»» email|string|false|none|none|
|»»» password|string|false|none|none|
|»»» token|string|false|none|none|
|»»» contents|[[Content](#schemacontent)]|false|none|none|
|»» nameContent|string|false|none|none|
|»» contentType|string|false|none|none|
|»» displayStatus|string|false|none|none|
|»» plataform|string|false|none|none|
|»» calification|integer(int32)|false|none|none|
|»» comment|string|false|none|none|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

<h1 id="openapi-definition-content-resources">Content resources</h1>

## findAll_2

<a id="opIdfindAll_2"></a>

> Code samples

```java
URL obj = new URL("http://localhost:8080/Content/findall");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

`GET /Content/findall`

*Get all Contents for the application*

> Example responses

> 200 Response

<h3 id="findall_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="findall_2-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Content](#schemacontent)]|false|none|none|
|» idContent|integer(int32)|false|none|none|
|» gender|[Gender](#schemagender)|false|none|none|
|»» idGender|integer(int32)|false|none|none|
|»» nameGender|string|false|none|none|
|»» content|[[Content](#schemacontent)]|false|none|none|
|» users|[[User](#schemauser)]|false|none|none|
|»» idUser|integer(int32)|false|none|none|
|»» name|string|false|none|none|
|»» email|string|false|none|none|
|»» password|string|false|none|none|
|»» token|string|false|none|none|
|»» contents|[[Content](#schemacontent)]|false|none|none|
|» nameContent|string|false|none|none|
|» contentType|string|false|none|none|
|» displayStatus|string|false|none|none|
|» plataform|string|false|none|none|
|» calification|integer(int32)|false|none|none|
|» comment|string|false|none|none|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
bearerAuth
</aside>

# Schemas

<h2 id="tocS_Content">Content</h2>
<!-- backwards compatibility -->
<a id="schemacontent"></a>
<a id="schema_Content"></a>
<a id="tocScontent"></a>
<a id="tocscontent"></a>

```json
{
  "idContent": 0,
  "gender": {
    "idGender": 0,
    "nameGender": "string",
    "content": [
      {
        "idContent": 0,
        "gender": {},
        "users": [
          {
            "idUser": 0,
            "name": "string",
            "email": "string",
            "password": "string",
            "token": "string",
            "contents": [
              {}
            ]
          }
        ],
        "nameContent": "string",
        "contentType": "string",
        "displayStatus": "string",
        "plataform": "string",
        "calification": 0,
        "comment": "string"
      }
    ]
  },
  "users": [
    {
      "idUser": 0,
      "name": "string",
      "email": "string",
      "password": "string",
      "token": "string",
      "contents": [
        {
          "idContent": 0,
          "gender": {
            "idGender": 0,
            "nameGender": "string",
            "content": [
              {}
            ]
          },
          "users": [],
          "nameContent": "string",
          "contentType": "string",
          "displayStatus": "string",
          "plataform": "string",
          "calification": 0,
          "comment": "string"
        }
      ]
    }
  ],
  "nameContent": "string",
  "contentType": "string",
  "displayStatus": "string",
  "plataform": "string",
  "calification": 0,
  "comment": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|idContent|integer(int32)|false|none|none|
|gender|[Gender](#schemagender)|false|none|none|
|users|[[User](#schemauser)]|false|none|none|
|nameContent|string|false|none|none|
|contentType|string|false|none|none|
|displayStatus|string|false|none|none|
|plataform|string|false|none|none|
|calification|integer(int32)|false|none|none|
|comment|string|false|none|none|

<h2 id="tocS_Gender">Gender</h2>
<!-- backwards compatibility -->
<a id="schemagender"></a>
<a id="schema_Gender"></a>
<a id="tocSgender"></a>
<a id="tocsgender"></a>

```json
{
  "idGender": 0,
  "nameGender": "string",
  "content": [
    {
      "idContent": 0,
      "gender": {
        "idGender": 0,
        "nameGender": "string",
        "content": []
      },
      "users": [
        {
          "idUser": 0,
          "name": "string",
          "email": "string",
          "password": "string",
          "token": "string",
          "contents": [
            {}
          ]
        }
      ],
      "nameContent": "string",
      "contentType": "string",
      "displayStatus": "string",
      "plataform": "string",
      "calification": 0,
      "comment": "string"
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|idGender|integer(int32)|false|none|none|
|nameGender|string|false|none|none|
|content|[[Content](#schemacontent)]|false|none|none|

<h2 id="tocS_User">User</h2>
<!-- backwards compatibility -->
<a id="schemauser"></a>
<a id="schema_User"></a>
<a id="tocSuser"></a>
<a id="tocsuser"></a>

```json
{
  "idUser": 0,
  "name": "string",
  "email": "string",
  "password": "string",
  "token": "string",
  "contents": [
    {
      "idContent": 0,
      "gender": {
        "idGender": 0,
        "nameGender": "string",
        "content": [
          {}
        ]
      },
      "users": [
        {
          "idUser": 0,
          "name": "string",
          "email": "string",
          "password": "string",
          "token": "string",
          "contents": []
        }
      ],
      "nameContent": "string",
      "contentType": "string",
      "displayStatus": "string",
      "plataform": "string",
      "calification": 0,
      "comment": "string"
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|idUser|integer(int32)|false|none|none|
|name|string|false|none|none|
|email|string|false|none|none|
|password|string|false|none|none|
|token|string|false|none|none|
|contents|[[Content](#schemacontent)]|false|none|none|

