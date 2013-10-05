package de.gesellix.gradle.debian.tasks.data

import org.gradle.api.tasks.Input

class DataDirectory {

  @Input
  String name
  @Input
  String[] inclusions
  @Input
  String[] exclusions
}