package com.wandrell.tabletop.business.util.command.punkapocalyptic;

import com.wandrell.service.application.ApplicationInfoService;
import com.wandrell.tabletop.business.service.punkapocalyptic.FileService;
import com.wandrell.tabletop.business.service.punkapocalyptic.LocalizationService;
import com.wandrell.tabletop.business.service.punkapocalyptic.ModelService;
import com.wandrell.tabletop.business.service.punkapocalyptic.RulesetService;
import com.wandrell.tabletop.data.service.punkapocalyptic.model.DataService;
import com.wandrell.util.command.CommandExecutor;

public interface ContextCommandExecutor extends CommandExecutor {

    public void setApplicationInfoService(final ApplicationInfoService service);

    public void setDataModelService(final DataService service);

    public void setFileService(final FileService service);

    public void setLocalizationService(final LocalizationService service);

    public void setModelService(final ModelService service);

    public void setRulesetService(final RulesetService service);

}
