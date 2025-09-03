# PVNApp Config Server

This project is a **Spring Cloud Config Server** that provides centralized configuration management for microservices in the PVNApp ecosystem.  
It fetches configuration properties (like `application-dev.properties`) from a remote Git repository and makes them available to client services at runtime.

## Features
- Centralized configuration for all microservices
- Supports multiple environments (`dev`)
- Properties stored in a Git repository for version control
- Auto-refresh capability for configuration changes

## Tech Stack
- Java 17+
- Spring Boot
- Spring Cloud Config
- Git

## How It Works
1. Config Server pulls configuration files from the remote Git repository.
2. Microservices fetch their configuration from the Config Server via REST endpoints like:
