# Android App Project - COMPSYS 302

This Android application was developed as part of the COMPSYS 302 course project. The app is built using Java and follows the standard Android development practices.

## Project Structure

The project follows a standard Android application structure with the following key components:

- `app/src/main/java/com/example/project_2/` - Main application package
  - `MainActivity.java` - Entry point of the application with top picks and category navigation
  - `ListActivity.java` - Base activity for displaying lists with search functionality
  - `ViewItemActivity.java` - Activity for viewing individual items
  - `model/` - Data models and data providers
  - `adapter/` - Custom adapters for RecyclerView and ListView

## Features

- Modern Android UI implementation with Material Design components
- Category-based navigation system
- Search functionality across all views
- Top picks section with horizontal scrolling
- Smooth animations and transitions between activities
- RecyclerView and ListView implementations
- Custom adapters for efficient list rendering
- CardView-based UI components
- SearchView integration for real-time filtering

## Technical Implementation

- Uses ViewHolder pattern for efficient view management
- Implements custom adapters for both RecyclerView and ListView
- Follows Android best practices for activity lifecycle management
- Includes smooth animations for activity transitions
- Implements search functionality with real-time filtering
- Uses CardView for modern UI components

## Requirements

- Android Studio
- Android SDK
- Java Development Kit (JDK)
- Gradle build system

## Building and Running

1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Connect an Android device or start an emulator
5. Click the "Run" button to build and deploy the app

## Project Configuration

The project uses standard Android build tools and configurations:

- Gradle build system
- Android SDK dependencies
- ProGuard rules for code optimization
