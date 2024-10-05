# Spring Boot JSONPlaceholder API Consumer

Este é um projeto simples usando **Spring Boot** que consome a API externa [JSONPlaceholder](https://jsonplaceholder.typicode.com/), uma API gratuita para testar requisições HTTP com dados fictícios.

## Funcionalidades
- Consumo da API de **posts** do JSONPlaceholder.
- Estrutura de projeto dividida em camadas: **config**, **entity**, **service**, **repository** e **controller**.
- Uso de **RestTemplate** para realizar requisições HTTP.

## Tecnologias Utilizadas
- **Java 17** ou superior
- **Spring Boot** 3.3.4
- **Maven** para gerenciamento de dependências
- **RestTemplate** para requisições HTTP
- **JSONPlaceholder** como fonte de dados

## Estrutura do Projeto

O projeto está organizado em diferentes camadas:

- **Config**: Configurações globais como `RestTemplate`.
- **Entity**: Representação dos dados consumidos da API (no caso, `Post`).
- **Service**: Contém a lógica de negócios para consumir a API.
- **Repository**: Separa a lógica de consumo de dados externos.
- **Controller**: Exposição de endpoints da API local.

