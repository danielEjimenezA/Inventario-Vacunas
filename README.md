<h1>API REST Inventario-Vacunas</h1>

<h3>http://localhost:8080/</h3>

|Método| Endpoint                  | Descripción |
|--------------| -----------               | ----------- |
|Post| empleado/registrar        | Registro de empleado por parte del administrador     |
|Put|empleado/actualizar     | Actualización de sus datos como empleado      |
|Post|vacunacion/guardar     | Registro de los datos de vacunacion del empleado      |

<h3>Endpoints registros bàsicos</h3>

<p>http://localhost:8080/rol/guardar</p>

```json
{
    "nombreRol": "Administrador"
}
```

```json
{
    "nombreRol": "Empleado"
}
```

<p>http://localhost:8080/tipovacuna/guardar</p>

```json
{
    "nombreTipoVacuna":"AstraZeneca"
}
```

```json
{
    "nombreTipoVacuna":"Sputnik"
}
```

```json
{
    "nombreTipoVacuna":"Pfizer"
}
```

```json
{
    "nombreTipoVacuna":"Jhonson&Jhonson"
}
```

<h3>Endpoint #1</h3>
<p>http://localhost:8080/empleado/registrar</p>

<h4>Ejemplo</h4>

```json
{
    "cedula":"1725374126",
    "nombres":"PABLO ANDRES",
    "apellidos":"JIMENEZ ANGAMARCA",
    "correoElectronico":"pj29805@gmail.com"
}
```

<h3>Endpoint #2</h3>
<p>http://localhost:8080/empleado/actualizar</p>

<h4>Ejemplo</h4>

```json
{
    "cedula":"1725374134",
    "fechaNacimiento":"1996-01-01",
    "direccionDomicilio":"Carcelen Bajo",
    "telefonoMovil":"0998320367",
    "estadoVacunacion":"true"
}
```

<h3>Endpoint #3</h3>
<p>http://localhost:8080/vacunacion/guardar</p>

<h4>Ejemplo</h4>

```json
{
    "cedulaEmpleado":"1725374134",
    "fechaVacunacion":"2022-08-29",
    "nroDosisVacunacion":1,
    "idEmpleado":{
        "cedula": "1725374134",
        "nombres": "DANIEL ESTEBAN",
        "apellidos": "JIMENEZ ANGAMARCA",
        "correoElectronico": "danielejimeneza@gmail.com",
        "fechaNacimiento": "1996-01-01T00:00:00.000+00:00",
        "direccionDomicilio": "Carcelen Bajo",
        "telefonoMovil": "0998320367",
        "estadoVacunacion": true,
        "idUsuario": {
            "idUsuario": 2,
            "nombreUsuario": "djimenez",
            "passwordUsuario": "admin123",
            "estadoUsuario": false,
            "rolUsuario": {
                "idRol": 1,
                "nombreRol": "Administrador"
            }
        }
    },
    "idTipoVacuna":{
        "idTipoVacuna": 1,
        "nombreTipoVacuna": "ASTRAZENECA"
    }
}
```
