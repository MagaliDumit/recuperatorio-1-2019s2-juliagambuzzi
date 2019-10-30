# "Diabólico III"

## Entrega

La solución y entrega de esta segunda parte se va a realizar en el repositorio provisto por los profesores.

Se deben subir los cambios en un branch llamado `recuperatorio_1` y se debe crear el pull request correspondiente en Github.

El código debe compilar y debe tener test unitarios que verifiquen la funcionalidad desarrollada.


### Creación del branch

El siguiente comando nos crea el nuevo branch y luego nos deja ya parados el mismo

```console
  git checkout -b recuperatorio_1
```

### Subida de los cambios

La primera vez que subimos los cambios, se crea el branch en el repositorio remoto, para eso hay que ejecutar el siguiente comando:

```console
  git push -u origin recuperatorio_1
```

Luego si es necesario subir nuevos commits, ejecutamos:

```console
  git push
```

### Crear Pull Request

Siempre que comiteamos sobre un branch, github nos ofrece crear un pull request.
También podemos crearlo usando el botón `New pull request`.

## Las condiciones mínimas NECESARIAS para aprobar

- Respertar la forma de entrega
- el código debe compilar
- Los tests tiene que correr
- Ambos ejercicios tienen que tener una resolución.

Cumpliar son necesarias pero no suficiente para aprobar, dependerá luego de la resolución provista. Tener en cuenta que los test unitarios son parte de la resolución.


# Parte 1: Escondites
Las almas están cansadas de ser cazadas por los demonios y desarrollan una habilidad que les permite, momentos antes de ser cazadas por uno, esconderse dentro del lugar al que pertenece y de esa forma evitar se cazadas.

Existen lugares más seguros donde las almas pueden esconderse de forma fácil y lugares más inseguros.
Cuando un demonio intenta cazar en un lugar, las almas corren a esconderse. Dependiendo las condiciones del lugar, un alma puede lograrlo o no. Si el alma logró esconderse el demonio no logra cazarla pero SI puede atormentarla.

Existen distintos lugares, algunos mas seguros que otros, pero en todos hay escondites en donde las almas pueden esconderse, eso si, todos los lugares tienen un límite de almas para esconder. Si llegó al límite, no se aceptan mas almas.
Por otro lado, por esconderse un alma debe pagar un penalidad que depende del lugar.

Por último, Cuándo salen las almas del escondite?, salen ni bien un demonio termina de cazar en ese lugar.

### Lugares

#### Paraíso
- Tiene 10 lugares para esconderse
- Lugar muy seguro para las almas, si hay lugar y el alma tiene `bondad` > 0, puede esconderse
- Solo se la penaliza descontando 1 en su `bondad`

#### Purgatorio
- Tiene 5 lugares para esconderse
- Si hay lugar , el alma tiene `bondad` > 10 y un `valor` > 5, puede esconderse
- Se la penaliza descontando 5 en su `bondad` y 1 en valor

#### Infierno
- Tiene 2 lugares para esconderse
- Si hay lugar, el alma NO es friolenta y  su `bondad` es igual a su `valor`, puede esconderse
- Se la penaliza conviertiendola en `friolanta`

# Parte 2: Batallas
El diablo a veces se aburre y para buscar algo de entretenimiento, organizó un torneo de batallas entre Demonios.
Para esto, cada demonio cuento con un conjunto de armas que le otorgan determinada energia.

Cada batalla consiste en la lucha entre 2 y gana el demonio que tiene mas poder. 
El poder de un demonio se calcula de la siguiente manera:

- poder: energia (provista por el arma) * nivel de maldad * cantidad de almas cazadas

Las batallas permiten que haya empates, en caso de empate.

### Premios y castigos
Luego de terminada una batalla, el diablo premia al ganadores y castiga al perdedor. Los premios y castigos dependen del humor del diablo, 
si está `contento` al ganador le otorna 10 puntos extras en su nivel de maldad y al perdedor solo le quita 2 almas cazadas. 
En cambio, si el diablo esta `triste` al ganador solo le otorga 1 punto extra en su nivel de maldad y al perdedor 
le quita todas las almas cazadas.

### Armas
Las armas disponibles para los demonios son las siguientes:
- Espada: Entrega 20 de poder
- Ballesta: Entrega 15 de poder
- Arco y flecha: Entrega 5 de poder
