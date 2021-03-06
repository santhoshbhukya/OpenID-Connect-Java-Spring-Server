<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="o" tagdir="/WEB-INF/tags"%>

<o:header title="Management Console"/>
<o:topbar pageName="Home" />

<!-- Modal dialogue for management UI -->
<div id="modalAlert" class="modal hide fade" tabindex="-1" role="dialog">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">&times;</button>
		<h3 id="modalAlertLabel"></h3>
	</div>
	<div class="modal-body"></div>
	<div class="modal-footer">
		<button class="btn btn-primary" data-dismiss="modal">OK</button>
	</div>
</div>

<div class="container-fluid main">
    <div class="row-fluid">
        <o:sidebar/>
        <div class="span10">
            <div class="content span12">
                <o:breadcrumbs crumb="Manage"/>
                <span id="content">
                    Loading <span id="loading"></span>...
                    <div class="progress progress-striped active">
                    	<div class="bar" style="width: 0%"></div>
                    </div>
                </span>
            </div>
        </div>
    </div>
</div>
<o:footer js="resources/js/admin.js" />
