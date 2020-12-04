# pipeline-library-demo


## Setup instructions

1. In Jenkins, go to Manage Jenkins &rarr; Configure System. Under _Global Pipeline Libraries_, add a library with the following settings:

    - Name: `pipeline-library-demo`
    - Default version: Specify a Git reference (branch or commit SHA), e.g. `master`
    - Retrieval method: _Modern SCM_
    - Select the _Git_ type
    - Project repository: `https://github.com/cicd-draft/pipeline-library-demo.git`
    - Credentials: (leave blank)