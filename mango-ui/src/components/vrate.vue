<template>
    <div>
        <el-row>
            <el-col :span="4">
                <span>默认不区分颜色</span>
                <el-rate v-model="value1"></el-rate>
            </el-col>

            <el-col :span="4" :offset="1">
                <span>区分颜色</span>
                <el-rate
                v-model="value2"
                :colors="colors"
                ></el-rate>
            </el-col>

            <el-col :span="4" :offset="1">
                <el-rate
                    v-model="value3"
                    show-text
                ></el-rate>
            </el-col>
            <el-col :span="4" :offset="1">
                <span>图标</span>
                <el-rate
                    v-model="value4"
                    :icon-classes="iconClasses"
                    void-icon-class="fa fa-frown-o"
                    :colors="['#99A9BF', '#F7BA2A', '#FF9900']"
                ></el-rate>

            </el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name:'vrate',
    data(){
        return{
            value1:0,
            value2:0,
            value3:0,
            value4:0,
            // 等同于 { 2: '#99A9BF', 4: { value: '#F7BA2A', excluded: true }, 5: '#FF9900' }
            colors:['#99A9BF', '#F7BA2A', '#FF9900'],
            iconClasses:['fa fa-frown-o', 'fa fa-meh-o', 'fa fa-smile-o']
        }
    }    
}
</script>

<style lang="scss" scoped>

</style>
