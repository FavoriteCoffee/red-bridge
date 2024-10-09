<template>
  <div>
    <button @click="scrollToMyElement">Прокрутить к элементу</button>
    <div style="height: 1000px;"></div> <!-- Добавляем некоторое пространство -->
    <div>Это элемент, к которому нужно прокрутить</div>
  </div>
</template>

<script>
    import { useAppStore } from "../stores/app.js";
   

export default {
  setup() {
    const myStore = useAppStore();

    const scrollToMyElement = () => {
      myStore.scrollToElement('feedbackForm');
    };

    return {
      scrollToMyElement
    };
  }
}
</script>