<template>

  <div id="app">
    <ContaLegal />
  </div>

</template>

<script>
import ContaLegal from './components/ContaLegal.vue'

export default {
  name: "App",
  components: {
    ContaLegal
  }
}

</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: rgb(32, 29, 29);
  color: black;
}
</style>