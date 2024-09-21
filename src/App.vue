<template>
  <v-app>
    <v-main>
      <!-- <Main></Main> -->
       <Technique></Technique>
      <router-view />
    </v-main>
  </v-app>
</template>

<script setup>
  import Main from "./pages/Main.vue"
  import Technique from "./pages/Technique.vue"
</script>
