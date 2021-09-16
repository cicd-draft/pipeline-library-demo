# pipeline-library-demo


## Setup instructions

1. In Jenkins, go to Manage Jenkins &rarr; Configure System. Under _Global Pipeline Libraries_, add a library with the following settings:

    - Name: `pipeline-library-demo`
    - Default version: Specify a Git reference (branch or commit SHA), e.g. `master`
    - Retrieval method: _Modern SCM_
    - Select the _Git_ type
    - Project repository: `https://github.com/cicd-draft/pipeline-library-demo.git`
    - Credentials: (leave blank)



## Groovy script usage  example

create a pipeline job ,use `Pipeline script`,then paste below context to the box.

use `logWithColor.groovy` function

```groovy
@Library('pipeline-library-demo')_

node() {
 timestamps {
    ansiColor('xterm'){
         echo "ehllo"
         logWithColor.info "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
         logWithColor.error "Praesent cursus orci sed lectus aliquet pretium."

    }
 }
}
```

use `withDBCredential.groovy` function, before you run the job ,you need to create a crendential name `Some-DB-user-pwd`, give the username and password to the crendential.

```groovy
@Library('pipeline-library-demo')_

pipeline{
    agent any
    
    stages{
        stage("One"){
            steps {
                withDBCredential{
                    sh "echo $USER >> tmpfile"
                }
            }
        }
    }
}
```

test gitmoji
