<template>
    <div>
        <el-row :gutter="20">
            <el-col :span="4">
                <span>默认</span>
                <el-slider v-model="value1"></el-slider>
            </el-col>
            
            <el-col :span="4">
                <span>自定义初始值</span>
                <el-slider v-model="value2"></el-slider>
            </el-col>

            <el-col :span="4">
                <span>隐藏tooltip</span>
                <el-slider v-model="value3" :show-tooltip="false"></el-slider>
            </el-col>

            <el-col :span="4">
                <span>格式化tooltip</span>
                <el-slider v-model="value4" :format-tooltip="formatTooltip"></el-slider>
            </el-col>

            <el-col :span="4">
                <span>禁用</span>
                <el-slider v-model="value5" disabled></el-slider>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="4">
                <span>不显示间断点</span>
                <el-slider v-model="value6" :step="10"></el-slider>
            </el-col>

            <el-col :span="4">
                <span>显示间断点</span>
                <el-slider v-model="value7"
                :step=10
                show-stops></el-slider>
            </el-col>

            <el-col :span="12">
                <el-slider
                v-model="value8" show-input></el-slider>
            </el-col>
        </el-row>

        <el-row :gutter="10">
            <el-col :span="4">
                <span>返回选择</span>
                <el-slider v-model="value9" range show-stops :max=10></el-slider>
            </el-col>

            <el-col :span="4">
                <el-slider v-model="value10" vertical height="100px"></el-slider>
            </el-col>

            <el-col :span="8">
                <el-slider v-model="value12" range :marks='marks'></el-slider>
            </el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name: 'vslider',
    data(){
        return {
            marks:{
                0: '0℃',
                8: '8℃',
                37: '37℃',
                50: {
                    style: {
                        color: '#1989FA'
                    },
                    label: this.$createElement('strong','50%')
                }
            },
            value1: '',
            value2: 30,
            value3: '',
            value4: '',
            value5: '',
            value6: '',
            value7: '',
            value8: '',
            value9: '',
            value10: '',
            value12: [30,60],
            value11: []
        }
    },
    methods: {
        formatTooltip(val){
            return val/100;
        }
    }
}
</script>

<style lang="scss" scoped>

</style>