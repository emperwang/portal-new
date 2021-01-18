<template>
    <div>
        <div>
            <el-progress :percentage="50"></el-progress>
            <el-progress :percentage="100" :format="format"></el-progress>
            <el-progress :percentage="100" status="success"></el-progress>
            <el-progress :percentage="100" status="warning"></el-progress>
            <el-progress :percentage="50" status="exception"></el-progress>
        </div>

        <div>
            <el-progress :text-inside="true" :stroke-width="26" :percentage="70"></el-progress>
            <el-progress :text-inside="true" :stroke-width="26" :percentage="70"
                status="success"
            ></el-progress>
        </div>

        <div>
            <el-progress type="circle" :percentage="25"></el-progress>
            <el-progress type="circle" :percentage="75" status="success"></el-progress>
        </div>
    </div>
</template>

<script>
export default {
    name:'vprocess',
    data(){
        return{

        }
    },
    methods:{
        format(percentage){
            return percentage===100?'满': `${percentage}`
        }
    }
}
</script>
<style lang="scss" scoped>

</style>
