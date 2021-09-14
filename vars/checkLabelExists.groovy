import jenkins.model.Jenkins
// See https://javadoc.jenkins-ci.org/jenkins/model/Jenkins.html#getLabel-java.lang.String-

/**
 * Verify Jenkins label exists.
 * <pre>
 * usage:
 * checkLabelExists('jenkins')
 * </pre>
 *
 * @Stages none
 *
 * @Prerequisites none
 *
 * @param label the label you want to verify
 *
 * @return null
 */
def call(label) {
    def jenkinsLabel = Jenkins.instance.getLabel(label)
    if (jenkinsLabel == null || jenkinsLabel.isEmpty()) {
        error("Label '${label}' does not exist on Jenkins")
    }
    echo "Label '${label}' exists!"
}