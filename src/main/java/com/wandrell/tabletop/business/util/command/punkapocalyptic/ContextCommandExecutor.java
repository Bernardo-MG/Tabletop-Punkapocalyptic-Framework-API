package com.wandrell.tabletop.business.util.command.punkapocalyptic;

import com.wandrell.pattern.command.CommandExecutor;
import com.wandrell.pattern.repository.Repository;
import com.wandrell.pattern.service.application.ApplicationInfoService;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.service.punkapocalyptic.FileService;
import com.wandrell.tabletop.business.service.punkapocalyptic.LocalizationService;
import com.wandrell.tabletop.business.service.punkapocalyptic.ModelService;
import com.wandrell.tabletop.business.service.punkapocalyptic.RulesetService;

public interface ContextCommandExecutor extends CommandExecutor {

    public void setApplicationInfoService(final ApplicationInfoService service);

    public void setFileService(final FileService service);

    public void setLocalizationService(final LocalizationService service);

    public void setModelService(final ModelService service);

    public void setRulesetService(final RulesetService service);

    public void setWeaponRepository(final Repository<Weapon> repository);

}
