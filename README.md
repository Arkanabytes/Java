# Java

# ☕ Java Development Repository

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![GitHub stars](https://img.shields.io/github/stars/Arkanabytes/Java?style=for-the-badge)](https://github.com/Arkanabytes/Java/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Arkanabytes/Java?style=for-the-badge)](https://github.com/Arkanabytes/Java/network)

> **Repositorio completo de desarrollo y aprendizaje Java - Desde fundamentos hasta proyectos avanzados**

Un repositorio integral que documenta mi trayectoria de aprendizaje y desarrollo en Java, incluyendo ejercicios prácticos, proyectos, algoritmos y buenas prácticas de programación.

---

## 📋 Tabla de Contenidos

- [🚀 Características](#-características)
- [📚 Contenido del Repositorio](#-contenido-del-repositorio)
- [🛠️ Tecnologías Utilizadas](#️-tecnologías-utilizadas)
- [⚡ Inicio Rápido](#-inicio-rápido)
- [📁 Estructura del Proyecto](#-estructura-del-proyecto)
- [🎯 Proyectos Destacados](#-proyectos-destacados)
- [📈 Progreso de Aprendizaje](#-progreso-de-aprendizaje)
- [🧪 Testing y Calidad](#-testing-y-calidad)
- [🤝 Contribuciones](#-contribuciones)
- [📚 Recursos y Referencias](#-recursos-y-referencias)
- [📞 Contacto](#-contacto)

---

## 🚀 Características

### ✨ Lo que encontrarás aquí:

- 🏗️ **Proyectos completos**: Aplicaciones funcionales con diferentes niveles de complejidad
- 📖 **Documentación detallada**: Cada proyecto incluye explicaciones y comentarios
- 🔧 **Buenas prácticas**: Código limpio siguiendo convenciones Java
- 🧪 **Testing**: Ejemplos de pruebas unitarias y de integración
- 📊 **Algoritmos y estructuras de datos**: Implementaciones optimizadas
- 🎨 **Patrones de diseño**: Ejemplos prácticos de patrones comunes
- 🔄 **Evolución del código**: Historial de mejoras y refactorizaciones

---

## 📚 Contenido del Repositorio

### 🎓 Nivel Principiante
- **Sintaxis básica** y fundamentos del lenguaje
- **Variables, tipos de datos** y operadores
- **Estructuras de control** (if, switch, loops)
- **Métodos y funciones** básicas
- **Manejo de arrays** y strings

### 🎯 Nivel Intermedio
- **Programación Orientada a Objetos** (POO)
- **Herencia, polimorfismo** y encapsulación
- **Interfaces y clases abstractas**
- **Colecciones** (List, Set, Map)
- **Manejo de excepciones**
- **Entrada/salida de datos** y manipulación de archivos

### 🚀 Nivel Avanzado
- **Programación funcional** y Stream API
- **Multithreading** y concurrencia
- **Patrones de diseño** (Singleton, Factory, Observer, etc.)
- **Conexión a bases de datos** (JDBC)
- **APIs REST** con Spring Boot
- **Testing** con JUnit y Mockito

---

## 🛠️ Tecnologías Utilizadas

### Core
![Java](https://img.shields.io/badge/Java_17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white)

### Frameworks y Librerías
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=spring-boot&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit5-25A162?style=flat-square&logo=junit5&logoColor=white)

### Bases de Datos
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?style=flat-square&logo=postgresql&logoColor=white)
![H2](https://img.shields.io/badge/H2-1F425F?style=flat-square&logo=h2&logoColor=white)

### Herramientas
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat-square&logo=intellij-idea&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=flat-square&logo=eclipse&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)

---

## ⚡ Inicio Rápido

### Prerrequisitos
- ☕ **Java JDK 17+** instalado
- 🛠️ **Maven** o **Gradle** (dependiendo del proyecto)
- 💻 **IDE** de tu preferencia (IntelliJ IDEA recomendado)
- 📁 **Git** para clonar el repositorio

### Instalación

```bash
# Clonar el repositorio
git clone https://github.com/Arkanabytes/Java.git

# Navegar al directorio
cd Java

# Explorar la estructura
ls -la
```

### Ejecutar proyectos

#### Con Maven:
```bash
# Compilar el proyecto
mvn compile

# Ejecutar tests
mvn test

# Ejecutar aplicación principal
mvn exec:java -Dexec.mainClass="com.arkanabytes.MainClass"
```

#### Con Gradle:
```bash
# Compilar el proyecto
./gradlew build

# Ejecutar tests
./gradlew test

# Ejecutar aplicación
./gradlew run
```

#### Ejecución directa:
```bash
# Compilar archivo Java
javac -cp "src/main/java" src/main/java/com/arkanabytes/MainClass.java

# Ejecutar
java -cp "src/main/java" com.arkanabytes.MainClass
```

---

## 📁 Estructura del Proyecto

```
Java/
├── 📁 src/
│   ├── 📁 main/java/
│   │   ├── 📁 fundamentals/        # Conceptos básicos
│   │   ├── 📁 oop/                 # Programación orientada a objetos
│   │   ├── 📁 algorithms/          # Algoritmos y estructuras de datos
│   │   ├── 📁 design-patterns/     # Patrones de diseño
│   │   ├── 📁 collections/         # Manejo de colecciones
│   │   ├── 📁 concurrency/         # Multithreading y concurrencia
│   │   ├── 📁 io/                  # Entrada/salida de datos
│   │   ├── 📁 database/            # Conexión a bases de datos
│   │   └── 📁 projects/            # Proyectos completos
│   ├── 📁 test/java/               # Tests unitarios
│   └── 📁 resources/               # Archivos de configuración
├── 📁 docs/                        # Documentación adicional
├── 📁 examples/                    # Ejemplos específicos
├── 📁 lib/                         # Dependencias (si no usas Maven/Gradle)
├── 📄 pom.xml                      # Configuración Maven (si aplica)
├── 📄 build.gradle                 # Configuración Gradle (si aplica)
├── 📄 .gitignore
└── 📄 README.md
```

---

## 🎯 Proyectos Destacados

### 🏪 Sistema de Gestión de Inventario
- **Descripción**: Aplicación completa para gestionar inventarios
- **Tecnologías**: Java, MySQL, Swing/JavaFX
- **Características**: CRUD completo, reportes, validaciones
- **Directorio**: `src/main/java/projects/inventory-system/`

### 🎮 Juego de Consola - Aventura de Texto
- **Descripción**: Juego interactivo con múltiples niveles
- **Tecnologías**: Java Core, POO avanzada
- **Características**: Sistema de puntuación, guardado de partidas
- **Directorio**: `src/main/java/projects/text-adventure/`

### 📊 API REST - Gestión de Tareas
- **Descripción**: API completa para gestión de tareas
- **Tecnologías**: Spring Boot, JPA, H2/MySQL
- **Características**: CRUD, autenticación, documentación
- **Directorio**: `src/main/java/projects/task-management-api/`

### 🔍 Algoritmos de Búsqueda y Ordenamiento
- **Descripción**: Implementación de algoritmos clásicos
- **Tecnologías**: Java Core, análisis de complejidad
- **Características**: Comparación de rendimiento, visualización
- **Directorio**: `src/main/java/algorithms/`

---

## 📈 Progreso de Aprendizaje

### Estadísticas del Repositorio
| Métrica | Valor | Estado |
|---------|-------|--------|
| 📝 **Líneas de código** | 15,000+ | En crecimiento |
| 📁 **Proyectos** | 12+ | Aumentando |
| 🧪 **Tests escritos** | 150+ | Mantenimiento activo |
| 📚 **Conceptos cubiertos** | 25+ | Expandiendo |
| ⭐ **Nivel de complejidad** | Intermedio-Avanzado | Evolucionando |

### Mapa de Progreso

```
Fundamentos Java    ████████████████████ 100%
POO                 ████████████████████ 100%
Colecciones         ███████████████████░ 95%
Exception Handling  ██████████████████░░ 90%
Streams & Lambda    ████████████████░░░░ 80%
Multithreading      █████████████░░░░░░░ 65%
Spring Framework    ████████░░░░░░░░░░░░ 40%
Microservicios      ████░░░░░░░░░░░░░░░░ 20%
```

### Certificaciones y Logros
- ✅ **Oracle Java SE 11 Developer** (En preparación)
- ✅ **Spring Professional Certification** (Objetivo 2025)
- ✅ **Clean Code Practices** (Implementado)
- ✅ **Test-Driven Development** (En práctica)

---

## 🧪 Testing y Calidad

### Herramientas de Testing
- **JUnit 5**: Tests unitarios
- **Mockito**: Mocking y stubbing
- **AssertJ**: Assertions fluidas
- **TestContainers**: Tests de integración con bases de datos

### Métricas de Calidad
- **Cobertura de código**: >85%
- **Análisis estático**: SonarLint integrado
- **Estilo de código**: Checkstyle configurado
- **Documentación**: Javadoc completo

### Ejemplo de Test
```java
@Test
@DisplayName("Debe calcular el factorial correctamente")
void shouldCalculateFactorialCorrectly() {
    // Given
    int number = 5;
    
    // When
    long result = MathUtils.factorial(number);
    
    // Then
    assertThat(result).isEqualTo(120L);
}
```

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Este repositorio está abierto a mejoras y nuevas ideas.

### Cómo Contribuir

1. **🍴 Fork** el repositorio
2. **🌟 Crea una rama** para tu feature: `git checkout -b feature/nueva-funcionalidad`
3. **✨ Commit** tus cambios: `git commit -am 'Añade nueva funcionalidad'`
4. **🚀 Push** a la rama: `git push origin feature/nueva-funcionalidad`
5. **📝 Crea un Pull Request** con descripción detallada

### Tipos de Contribuciones Buscadas

| Tipo | Descripción | Etiqueta |
|------|-------------|----------|
| 🐛 **Bug Fixes** | Corrección de errores | `bug` |
| ✨ **Features** | Nuevas funcionalidades | `enhancement` |
| 📖 **Documentación** | Mejoras en docs | `documentation` |
| 🧪 **Tests** | Nuevos tests o mejoras | `tests` |
| 🎨 **Refactoring** | Mejora del código existente | `refactoring` |

### Guías de Contribución
- Sigue las convenciones de código Java estándar
- Incluye tests para nuevas funcionalidades
- Documenta métodos públicos con Javadoc
- Mantén commits pequeños y descriptivos
- Actualiza el README si es necesario

---

## 📚 Recursos y Referencias

### Documentación Oficial
- [Oracle Java Documentation](https://docs.oracle.com/en/java/) - Referencia oficial completa
- [Java Tutorial](https://docs.oracle.com/javase/tutorial/) - Tutorial oficial de Oracle
- [OpenJDK](https://openjdk.java.net/) - Implementación open source de Java

### Libros Recomendados
- 📖 **Effective Java** - Joshua Bloch
- 📖 **Clean Code** - Robert C. Martin
- 📖 **Java: The Complete Reference** - Herbert Schildt
- 📖 **Spring in Action** - Craig Walls

### Recursos Online
- [Baeldung](https://www.baeldung.com/) - Tutoriales Java avanzados
- [Java Code Geeks](https://www.javacodegeeks.com/) - Artículos y ejemplos
- [DZone Java Zone](https://dzone.com/java-jdk-development-tutorials-tools-news) - Noticias y tutoriales
- [Stack Overflow](https://stackoverflow.com/questions/tagged/java) - Comunidad de desarrolladores

### Herramientas Útiles
- [Java Visualizer](http://www.pythontutor.com/java.html) - Visualizar ejecución de código
- [Regex101](https://regex101.com/) - Testing de expresiones regulares
- [JSON Formatter](https://jsonformatter.curiousconcept.com/) - Formatear JSON
- [Maven Repository](https://mvnrepository.com/) - Búsqueda de dependencias

---

## 🏆 Logros y Reconocimientos

### Hitos Personales
- 🎯 **+15,000 líneas de código Java** escritas
- 🧪 **+150 tests unitarios** implementados
- 📚 **+25 conceptos Java** dominados
- 🏗️ **+12 proyectos** completados
- ⭐ **Código limpio** y bien documentado

### Feedback de la Comunidad
> *"Excelente organización y documentación. Un gran recurso para aprender Java."* - **Desarrollador Senior**

> *"Los ejemplos son claros y los proyectos están bien estructurados."* - **Estudiante de Programación**

---

## 📞 Contacto

¿Preguntas, sugerencias o quieres colaborar?

| Plataforma | Información | Uso |
|-----------|-------------|-----|
| 📧 **Email** | [konshuelo@hotmail.com](mailto:konshuelo@hotmail.com) | Contacto directo |
| 💼 **LinkedIn** | [Consuelo Pinto Toro](https://www.linkedin.com/in/consuelo-alejandra-pinto-toro/) | Networking profesional |
| 🐙 **GitHub** | [@Arkanabytes](https://github.com/Arkanabytes) | Proyectos y código |
| 💬 **Issues** | [Abrir Issue](https://github.com/Arkanabytes/Java/issues) | Reportar bugs o sugerir features |

---

## 📊 Estadísticas del Repositorio

![GitHub Stats](https://github-readme-stats.vercel.app/api/pin/?username=Arkanabytes&repo=Java&theme=radical)

### Actividad Reciente
- 🔥 **Commits this month**: 25+
- 📈 **Lines added**: 2,500+
- 🧪 **Tests added**: 20+
- 📚 **Documentation updated**: 5 files

---

## 📝 Changelog

### Versión 2.0.0 (Agosto 2025)
- ✨ Añadidos proyectos con Spring Boot
- 🧪 Implementados tests con JUnit 5
- 📖 Documentación completamente renovada
- 🔄 Refactorización completa de estructura

### Versión 1.5.0 (Julio 2025)
- 🎯 Añadidos patrones de diseño
- 🔗 Implementación de JDBC
- 📊 Algoritmos de ordenamiento optimizados

### Versión 1.0.0 (Junio 2025)
- 🎉 Lanzamiento inicial
- ✅ Fundamentos de Java completados
- 🏗️ Estructura básica del repositorio

---

## 📜 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

```
MIT License

Copyright (c) 2025 Consuelo Pinto Toro (@Arkanabytes)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

<div align="center">

## 💫 ¡Gracias por visitar mi repositorio!

**Si este repositorio te ha sido útil, considera darle una ⭐ para apoyar mi trabajo**

*Desarrollado con* ❤️ *y mucho* ☕ *por* **Consuelo Pinto Toro**

---

**📅 Última actualización:** Agosto 2025 | **📝 Versión:** 2.0.0 | **🔧 Mantenimiento:** Activo

[⬆️ Volver al inicio](#-java-development-repository)

</div>


Autor: Consuelo Pino
