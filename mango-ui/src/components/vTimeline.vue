<template>
    <div>
        <div>
            排序:
            <el-radio-group v-model="reverse">
                <el-radio :label="true">倒序</el-radio>
                <el-radio :label="false">正序</el-radio>
            </el-radio-group>
        </div>
        <div>
            <el-timeline :reverse="reverse">
                <el-timeline-item
                    v-for="(activity,index) in activities"
                    :key="index"
                    :icon="activity.icon"
                    :type="activity.type"
                    :color="activity.color"
                    :size="activity.size"
                    :timestamp="activity.timestamp"
                ></el-timeline-item>
            </el-timeline>
        </div>

        <div style="margin-top:100px;">
            <el-timeline>
                <el-timeline-item timestamp="2018/4/12" placement="top">
                    <el-card>
                        <h4>更新github模板</h4>
                        <p>王小虎 提交于 2018/4/12 20:46</p>
                    </el-card>
                </el-timeline-item>
                <el-timeline-item timestamp="2018/4/3" placement="top">
                    <el-card>
                        <h4>更新github模板</h4>
                        <p>王小虎 提交于 2018/4/3 20:46</p>
                    </el-card>
                </el-timeline-item>
                <el-timeline-item timestamp="2018/4/1" placement="top">
                    <el-card>
                        <h4>更新github模板</h4>
                        <p>王小虎 提交于 2018/4/12 20:46</p>
                    </el-card>
                </el-timeline-item>
            </el-timeline>
        </div>
    </div>
</template>
<script>
export default {
    name:'vtimeline',
    data(){
        return{
            reverse:false,
            activities: [{
                content:'支持使用图标',
                timestamp:'2018-04-12 20:46',
                size:'large',
                type:'primary',
                icon:'el-icon-more'
            },{
                content:'支持自定义颜色',
                timestamp:'2018-04-03 20:47',
                color:'#0bbd87'
            },{
                content:'支持自定义尺寸',
                timestamp:'2018-04-03 20:48',
                size:'large'
            },{
                content:'默认样式节点',
                timestamp:'2018-04-03 20:49'
            }]
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
