package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Address;
import seedu.address.model.person.Language;
import seedu.address.model.person.LastVisit;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Visit;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_LANGUAGE = "English";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_LAST_VISIT = "2021-01-01";
    public static final String DEFAULT_VISIT = "10 Oct 2021";

    private Name name;
    private Phone phone;
    private Language language;
    private Address address;
    private LastVisit lastVisit;
    private Visit visit;
    private Set<Tag> tags;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        language = new Language(DEFAULT_LANGUAGE);
        address = new Address(DEFAULT_ADDRESS);
        lastVisit = new LastVisit(DEFAULT_LAST_VISIT);
        visit = new Visit(DEFAULT_VISIT);
        tags = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        language = personToCopy.getLanguage();
        address = personToCopy.getAddress();
        lastVisit = personToCopy.getLastVisit();
        visit = personToCopy.getVisit();
        tags = new HashSet<>(personToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code LastVisit} of the {@code Person} that we are building.
     */
    public PersonBuilder withLastVisit(String lastVisit) {
        this.lastVisit = new LastVisit(lastVisit);
        return this;
    }

    /**
     * Sets the {@code Visit} of the {@code Person} that we are building.
     */
    public PersonBuilder withVisit(String visit) {
        this.visit = new Visit(visit);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Language} of the {@code Person} that we are building.
     */
    public PersonBuilder withLanguage(String language) {
        this.language = new Language(language);
        return this;
    }

    public Person build() {
        return new Person(name, phone, language, address, lastVisit, visit, tags);
    }

}
