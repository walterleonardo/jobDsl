project_name = "JobDslName1"
repo = "git@github.com:walterleonardo/jobDsl.git"
repo_name = "jobDslName"


pipelineJob(project_name) {
	definition {
		triggers{
			scm('H/1 * * * *')
		}
		
		cpsScm{
			scm{
				git{
					remote {
					name(repo_name)
					url(repo)
					}
				}
				scriptPath("Jenkinsfile")
			}
		}
	}
}
