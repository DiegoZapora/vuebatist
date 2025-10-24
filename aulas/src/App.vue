<template>

  <div id="app">
    <img v-if="mostrar" :src="minhaImagem" style="width: 250px;" :alt="descricao" class="img">
    <Arg @mostrar-img="mudarImg" />
  </div>

</template>

<script>
import Arg from "./components/Arg.vue"
import sas from "./assets/sas.png"

export default {
  name: "App",
  components: {
    Arg
  },
  data () {
    return {
      minhaImagem: sas,
      descricao: "Andre IMG",
      mostrar: false
    }
  },
  methods: {
    mudarImg() {
      this.mostrar = !this.mostrar
    }
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