<template>
    <div>
        <button @click="$emit('mostrarImg')">Mostrar</button>
    </div>
</template>

<script>
export default {
    name: "Arg",
    emits: ["mostrarImg"]
}
</script>