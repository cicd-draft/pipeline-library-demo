import jenkins.model.Jenkins

/**
 * check the existent of jenkins plugin 'plugin-A', 'plugin-B', 'plugin-C'.
 * <pre>
 * usage:
 * checkRequiredPlugins()
 * </pre>
 *
 * @Stages none
 *
 * @Prerequisites none
 *
 * @param none
 *
 * @return null
 */
def call() {
    Object[] requiredPlugins = ['htmlpublisher', 'git'].toArray()

    List<String> pluginsByName = Jenkins.instance.pluginManager.plugins.collect {
        return it.getShortName()
    }

    if(!pluginsByName.containsAll(requiredPlugins)) {
        echo "Required plugins: ${requiredPlugins.toString()}"
        echo "Installed plugins: ${pluginsByName.toString()}"
        error('Required plugins are not present.')
    }

    echo "All required plugins are installed!"
}