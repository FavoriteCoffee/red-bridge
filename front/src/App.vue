<template>
  <v-app>
    <v-main>
      <!-- <Main></Main> -->
       <!-- <Technique></Technique> -->
        <!-- <Lines></Lines> -->
         <Contacts></Contacts>
      <router-view />
    </v-main>
  </v-app>
</template>

<script setup>
  import Main from "./pages/Main.vue"
  import Technique from "./pages/Technique.vue"
  import Lines from "./pages/Lines"
  import Contacts from "./pages/Contacts.vue"
</script>
