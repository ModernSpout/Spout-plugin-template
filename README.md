<div align="center">

  <h1>
    Plugin template<br>(Spout)
  </h1>

</div>

## Introduction

This is a template for Spout plugins.

It includes these example features:
* There is an item `example_stuff:example_green_screen_paint` that is crafted from 1 green dye
* There is a block `example_stuff:example_green_screen_block` that is crafted from any wool and the green screen paint
* When a player looks at a green screen block, they receive a chat message telling them so.

If you want to begin with an empty slate,
just delete `ExamplePluginListener`, `data_pack/data` and `resource_pack/assets`

There are no releases; the description below is an example.

### How to test

* `./gradlew jar` to build the plugin JAR
* `./gradlew downloadServer` to download the Spout server JAR (needed for below)
* `./gradlew runServer` to spin up a Spout server with the plugin

## Download

Download the latest release from the **Releases** on the right,
or a development version from **Actions** on the top (click a version, and scroll down to **Artifacts**).

## Installation

Place the `.jar` file into the `plugins` folder.

Requires [Spout](https://github.com/ModernSpout/Spout-Paper-server).
