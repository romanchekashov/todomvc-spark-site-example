module.exports = function(grunt) {

    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        less: {
            development: {
                options: {
                    paths: ["private/styles"]
                },
                files: {
                    "src/main/resources/public/styles/index.css": "src/main/resources/private/styles/index.less"
                }
            }
        },
        copy: {
            main: {
                files: [{
                    src: 'node_modules/todomvc-common/**',
                    dest: 'src/main/resources/public/js/',
                    expand: true
                },{
                    src: 'node_modules/react/**',
                    dest: 'src/main/resources/public/js/',
                    expand: true
                },{
                    src: 'node_modules/classnames/**',
                    dest: 'src/main/resources/public/js/',
                    expand: true
                },{
                    src: 'node_modules/director/**',
                    dest: 'src/main/resources/public/js/',
                    expand: true
                }]
            }
        }
    });

    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-less');
    grunt.loadNpmTasks('grunt-contrib-copy');

    grunt.registerTask('default', ['less', 'copy']);
};