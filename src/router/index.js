
import { createRouter, createWebHistory } from 'vue-router'
import Main from "../pages/Main.vue";
import News from "../pages/News.vue";
import Technique from "../pages/Technique.vue";
import Lines from "../pages/Lines.vue";
import Contacts from '@/pages/Contacts.vue';
// import Video from "../pages/Video.vue";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/main', component: Main, alias: '/'},
    { path: '/news', component: News},
    { path: '/technique', component: Technique},
    { path: '/lines', component: Lines},
    { path: '/contacts', component: Contacts},
  ]
})


export default router


/**
 * router/index.ts
 *
 * Automatic routes for `./src/pages/*.vue`
 */

// Composables
// import { createRouter, createWebHistory } from 'vue-router/auto'
// import Main from "../pages/Main.vue"
// import { setupLayouts } from 'virtual:generated-layouts'
// import { routes } from 'vue-router/auto-routes'

// const router = createRouter({
//   history: createWebHistory(import.meta.env.BASE_URL),
//   routes: setupLayouts(routes),
// })

// Workaround for https://github.com/vitejs/vite/issues/11804
// router.onError((err, to) => {
//   if (err?.message?.includes?.('Failed to fetch dynamically imported module')) {
//     if (!localStorage.getItem('vuetify:dynamic-reload')) {
//       console.log('Reloading page to fix dynamic import error')
//       localStorage.setItem('vuetify:dynamic-reload', 'true')
//       location.assign(to.fullPath)
//     } else {
//       console.error('Dynamic import error, reloading page did not fix it', err)
//     }
//   } else {
//     console.error(err)
//   }
// })

// router.isReady().then(() => {
//   localStorage.removeItem('vuetify:dynamic-reload')
// })






