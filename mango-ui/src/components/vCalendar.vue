<template>
    <div>
        <el-calendar v-model="values"></el-calendar>
    </div>
</template>
<script>
export default {
    name:'vcalendar',
    data(){
        return{
            values: new Date()
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
