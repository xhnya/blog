const path = require('path')
module.exports = {
    // 关闭eslint
    lintOnSave: false,
    devServer: {
        port: 80,
        open: true,
        proxy: {
            '/blog': {
                target: 'http://localhost:9011',
                //pathRewrite:{'^/api':''},路径重写
            }
        }
    },
    pluginOptions: {
        'style-resources-loader': {
            preProcessor: 'less',
            patterns: [path.resolve(__dirname, "src/assets/style/global.less")] // 引入全局样式变量
        }
    }
}
