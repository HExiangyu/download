// 引入 gulp
var gulp = require('gulp');

// 引入组件
var jshint = require('gulp-jshint');
var sass = require('gulp-sass');
var minifyCss = require('gulp-minify-css');
var concat = require('gulp-concat');
var uglify = require('gulp-uglify');
var rename = require('gulp-rename');

// 检查脚本
gulp.task('lint', function() {
    gulp.src('./js/*.js')
        .pipe(jshint())
        .pipe(jshint.reporter('default'));
});

//编译Sass
gulp.task('sass', function() {
    gulp.src('./scss/*.scss')
        .pipe(sass())
        .pipe(gulp.dest('./css'));
});

// 压缩文件
gulp.task('min', function() {
    gulp.src('./js/*.js')
        .pipe(uglify());
    gulp.src('./css/*.css')
        .pipe(minifyCss());
});

//监听
gulp.task("watchscss",function(){
    //监听文件变化
    gulp.watch('./scss/*.scss', function(){
        gulp.run('sass');
    });
});

// 默认任务
gulp.task('default', function(){
    gulp.run('lint', 'scripts');
});
