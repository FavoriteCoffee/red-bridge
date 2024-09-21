<template>
  <v-app>
    <v-main>
          <router-view /> 
          <Lines></Lines>     
    </v-main>
  </v-app>
</template>

<script setup>
import Lines from "./pages/"
</script>
