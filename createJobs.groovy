pipelineJob('icin-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sumeetyajnik/SumeetYajnik_FSD_Course7_ICIN_Bank.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}