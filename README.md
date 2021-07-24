# android-country-states
An android library which populates every country information.
_________________________
[![](https://jitpack.io/v/4xMafole/android-country-states.svg)](https://jitpack.io/#4xMafole/android-country-states)
 [![](https://img.shields.io/badge/platform-android-orang)](https://img.shields.io/badge/platform-android-orange) [![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)

## Supported Features
- [x] States
- [ ] Codes
- [ ] Cities
- [ ] Capital
- [ ] Currencies
- [ ] Flags
- [ ] Location
- [ ] Population

# Getting Started

## Prerequisites
Add this in your root ```build.gradle``` file (not on module ```build.gradle``` file)

        allprojects 
        {
          repositories 
          {
            ...
            maven { url "https://jitpack.io" }
          }
        }

## Dependency
Add this to your module's ```build.gradle```

	dependencies 
        {
	        implementation 'com.github.4xMafole:android-country-states:v0.1.0-beta'
	}
  
  ## How To Use
  
  - Allow internet permission in ```AndroidManifest.xml```
  
        <uses-permission android:name="android.permission.INTERNET"/>
        

### States

- Initializing Client

        StateClient client = new StateClient();
        client.setCountry("<COUNTRY_NAME");
        
- Running State Service

        client.run();
        
- Getting the states

        ArrayList<String> states = client.statesList();


## Contribution
Please fork this repository and contribute back using [pull requests](https://github.com/4xMafole/android-country-states/pulls).

Any contributions, large or small, major features, bug fixes, are all welcomed and appreciated but will be thoroughly reviewed.

### Contact - Let's become friends
- [![Twitter](https://img.shields.io/twitter/url?label=Twitter%20%404xMafole&style=social&url=https%3A%2F%2Ftwitter.com%2F4xmafole)](https://twitter.com/intent/tweet?text=Wow:&url=https%3A%2F%2Ftwitter.com%2F4xmafole)

