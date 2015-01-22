package com.wandrell.tabletop.business.util.command.punkapocalyptic;

import com.wandrell.service.application.ApplicationInfoService;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.service.punkapocalyptic.FileService;
import com.wandrell.tabletop.business.service.punkapocalyptic.LocalizationService;
import com.wandrell.tabletop.business.service.punkapocalyptic.ModelService;
import com.wandrell.tabletop.business.service.punkapocalyptic.RulesetService;
import com.wandrell.util.command.CommandExecutor;
import com.wandrell.util.repository.Repository;

public interface ContextCommandExecutor extends CommandExecutor {

    public void setApplicationInfoService(final ApplicationInfoService service);

    public void setFileService(final FileService service);

    public void setLocalizationService(final LocalizationService service);

    public void setModelService(final ModelService service);

    public void setRulesetService(final RulesetService service);

    public void setWeaponRepository(final Repository<Weapon> repository);

}
