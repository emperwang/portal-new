<template>
    <div>
        <div>
            <el-steps :active="active" finish-status="success">
                <el-step title="步骤1"></el-step>
                <el-step title="步骤2"></el-step>
                <el-step title="步骤3"></el-step>
            </el-steps>
            <el-button style="margin-top:12px;" @click="next">下一步</el-button>
        </div>  
    </div>
</template>

<script>
export default {
    name: 'vsteps',
    data(){
        return {
            active:0,
        }
    }, 
    methods:{
        next() {
            if(this.active++ > 2){
                this.active=0;
            }
        }
    }
}
</script>

<style lang="scss" scoped>

</style>