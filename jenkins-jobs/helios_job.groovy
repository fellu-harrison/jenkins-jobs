pipelineJob('helios-build-deploy') {

    displayName('Helios Build and Deploy')
    description('Pipeline to build and deploy Helios service across environments.')

    parameters {
        stringParam('branch', '', 'Branch to test and deploy to dev, i.e EE-1111')
    }

    definition {
        cps {
            script(readFileFromWorkspace('pipelines/helios/Jenkinsfile'))
            sandbox()
        }
    }
}
