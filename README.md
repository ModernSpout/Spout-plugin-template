<div align="center">

  <h1>
    Plugin template<br>(Spout)
  </h1>

</div>

## Introduction

This is a template for a [Spout](https://github.com/ModernSpout/Spout) plugin.

It compiles, but it adds no content yet.
If you want a template that contains some example blocks and items,
see [here](https://github.com/ModernSpout/Spout-plugin-example).

To make this template into your own plugin, you should:
* Make a new project by clicking **Use this template** on the top-right
* Replace the plugin name in `settings.gradle.kts`
* Replace the group and description in `gradle.properties`
* Replace the plugin name and website in `src/main/resource/paper-plugin.yml`
* Rename the `com.example.spoutexampleplugin` package
* Rename the `ExamplePlugin` and `ExamplePluginBootstrap` classes\
  (and update `paper-plugin.yml`)
* Replace the plugin name in `src/main/resource/data_pack/pack.mcmeta`
* Add your own content in `src/main/resources/data_pack` and `src/main/resources/resource_pack`\
  (you can read how to add your own blocks and items [on the wiki](https://github.com/ModernSpout/Spout/wiki/*-Making-a-Spout-plugin))
* Replace the text in this `README.md`\
  (you may keep the download/installation instructions below, or modify them as you like)

#### How to test

* `./gradlew jar` to build the plugin JAR
* `./gradlew downloadServer` to download the Spout server JAR (needed for below)
* `./gradlew runServer` to spin up a Spout server with the plugin

## Download

Download the latest release from the **Releases** on the right,
or a development version from **Actions** on the top (click a version, and scroll down to **Artifacts**).

## Installation

Place the `.jar` file into the `plugins` folder.

Requires [Spout](https://github.com/ModernSpout/Spout).
